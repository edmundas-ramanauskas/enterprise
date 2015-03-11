var marketplace = angular.module('marketplace', ['ngRoute', 'ngAnimate', 'software']);

marketplace.config(function($routeProvider) {
  $routeProvider
    .when('/', {
        templateUrl: 'public/html/home.html'
    })
    .when('/about', {
        templateUrl: 'public/html/about.html'
    })
    .when('/apps', {
        templateUrl: 'public/html/software/items.html',
        controller: 'SoftwareController'
    })
    .otherwise({
        redirectTo:'/'
    });
});

marketplace.directive('appExample', ['$http', function($http) {
    return {
        link: function(scope, element, attrs) {
            element.html('');
        }
    }
}]);