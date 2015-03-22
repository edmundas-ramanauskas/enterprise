var tools = angular.module('tools', []);

tools.controller('UrlEncoder', ['$scope', 'storage', 'url', function($scope, storage, url) {
    $scope.encode = function() {
        this.decoder = url.encode(this.encoder);
        storage.set('url-encoder', this.encoder);
        storage.set('url-decoder', this.decoder);
    }
    $scope.decode = function() {
        this.encoder = url.decode(this.decoder);
        storage.set('url-encoder', this.encoder);
        storage.set('url-decoder', this.decoder);
    }
    $scope.clear = function() {
        this.encoder = '';
        this.decoder = '';
    }
}]);

tools.controller('Base64Encoder', ['$scope', 'storage', function($scope, storage) {
    $scope.encode = function() {
        this.decoder = Base64.encode(this.encoder);
        storage.set('base64-encoder', this.encoder);
        storage.set('base64-decoder', this.decoder);
    }
    $scope.decode = function() {
        this.encoder = Base64.decode(this.decoder);
        storage.set('base64-encoder', this.encoder);
        storage.set('base64-decoder', this.decoder);
    }
    $scope.clear = function() {
        this.encoder = '';
        this.decoder = '';
    }
}]);

tools.controller('Md5Checksum', ['$scope', 'storage', function($scope, storage) {
    $scope.checksum = function() {
        if(this.encoder) {
            this.decoder = CryptoJS.MD5(this.encoder).toString();
        } else {
            this.decoder = '';
        }
        storage.set('md5-checksum', this.decoder);
    }
    $scope.clear = function() {
        this.encoder = '';
        this.decoder = '';
    }
}]);