//自定义Service
angular.module("inspinia").service("orderService", ["$q", "$http", function ($q, $http) {
    $http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded; charset=UTF-8";
    this.listDisease = function (batchNo) {
        return $http.get("order/get?batchNo=" + batchNo).then(function (resp) {
            // return $http.get("data/orderList.json").then(function(resp) {
            if (typeof resp.data === "object") {
                return resp.data;
            } else {
                return $q.reject(resp.data);
            }
        }, function (resp) {
            return $q.reject(resp.status);
        });
    };
}]);

