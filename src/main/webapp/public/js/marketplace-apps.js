var apps = angular.module('apps', []);

apps.controller('AppList', ['$scope', '$http', function($scope, $http){
    $scope.apps = [];
    $http.get('/marketplace/api/rs/applications').success(function(data) {
        $scope.apps = data.content;
    });
}]);

apps.controller('AppView', ['$scope', '$routeParams', '$http', function($scope, $routeParams, $http){
    $scope.app = {};
    $http.get('/marketplace/api/rs/application/'+$routeParams.id).success(function(data) {
        $scope.app = data;
    });
}]);