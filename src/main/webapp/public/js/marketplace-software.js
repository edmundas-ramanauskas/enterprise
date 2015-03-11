var software = angular.module('software', []);

software.controller('SoftwareController', function($scope, $http){
    $scope.apps = [];
    $http.get('/enterprise/software').success(function(data) {
        $scope.apps = data;
    });
});