var marketplace = angular.module('marketplace', ['ngRoute', 'ngAnimate', 'tools', 'monitor']);

marketplace.config(function($routeProvider) {
  $routeProvider
    .when('/', {
        templateUrl: 'public/html/home.html'
    })
    .when('/about', {
        templateUrl: 'public/html/about.html'
    })
//    .when('/apps', {
//        templateUrl: 'public/html/apps/list.html',
//        controller: 'AppList'
//    })
//    .when('/apps/:id', {
//        templateUrl: 'public/html/apps/view.html',
//        controller: 'AppView'
//    })
    .when('/monitor', {
        templateUrl: 'public/html/monitor/index.html',
        controller: 'SiteMonitor'
    })
    .when('/tools/url-encoder', {
        templateUrl: 'public/html/tools/url-encoder.html',
        controller: 'UrlEncoder'
    })
    .when('/tools/md5-checksum', {
        templateUrl: 'public/html/tools/md5-checksum.html',
        controller: 'Md5Checksum'
    })
    .when('/tools/sha1-checksum', {
        templateUrl: 'public/html/tools/sha1-checksum.html',
        controller: 'Sha1Checksum'
    })
    .when('/tools/base64-encoder', {
        templateUrl: 'public/html/tools/base64-encoder.html'
    })
    .when('/tools/image-encoder', {
        templateUrl: 'public/html/tools/image-encoder.html'
    })
    .when('/tools/json-validator', {
        templateUrl: 'public/html/tools/json-validator.html'
    })
    .otherwise({
        redirectTo:'/'
    });
});

marketplace.factory('storage', [ function() {
    return {
        map: {},
        set: function(key, value) {
            this.map[key] = value;
        },
        get: function(key) {
            return this.map[key];
        }
    }
}]);
marketplace.factory('url', [ function() {
    return {
        encode: function(link) {
            return encodeURIComponent(link).replace(/'/g,"%27").replace(/"/g,"%22");
        },
        decode: function(link) {
            return decodeURIComponent(link.replace(/\+/g,  " "));
        }
    }
}]);

marketplace.directive('zeroClipboard', ['storage', function(storage) {
    ZeroClipboard.config( { swfPath: "public/swf/ZeroClipboard.swf" } );
    return function(scope, element, attr) {
        var clipboard = new ZeroClipboard(element[0]);
        clipboard.on('copy', function(event) {
            event.clipboardData.setData('text/plain', storage.get(attr.zeroClipboard));
        });
    }
}]);

marketplace.directive('codemirror', [function() {
    return function(scope, element, attr) {
        CodeMirror.fromTextArea(element[0], {
            lineNumbers: true
        });
    }
}]);