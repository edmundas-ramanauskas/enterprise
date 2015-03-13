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
        templateUrl: 'public/html/software/list.html',
        controller: 'AppList'
    })
    .when('/apps/:id', {
        templateUrl: 'public/html/software/view.html',
        controller: 'AppView'
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