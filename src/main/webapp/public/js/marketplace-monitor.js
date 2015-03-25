var monitor = angular.module('monitor', []);

monitor.controller('SiteMonitor', ['$scope', '$http', 'url', function($scope, $http, url){
    $scope.checkStatus = function() {
        if($scope.link) {
            $http.get('/marketplace/api/rs/public/monitor/status?url='+url.encode($scope.link)).success(function(data) {
                $scope.site = data;
            });
        } else {
            $scope.site = undefined;
        }
    }
}]);