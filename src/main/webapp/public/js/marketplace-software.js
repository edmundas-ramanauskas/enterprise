var software = angular.module('software', []);

software.controller('SoftwareController', function($scope, $http){
    $scope.apps = [];
    $http.get('/marketplace/api/rs/applications').success(function(data) {
        $scope.apps = data.content;
    });
});