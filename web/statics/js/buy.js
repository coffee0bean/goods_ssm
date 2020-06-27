var deta = null;
$(document).ready(function () {
    $.ajax({
        url: "../detail/selectDetailById.action",
        data: {
            id: getQueryVariable("id")
        },
        dataType: "json",
        type: "get",
        success: function (data) {
            a.detail = data;
        }
    })
})
var a = new Vue({
    el: "#app",
    data: {
        detail: deta,
        number: 1,
        sum: this.detail.price * this.number,
    },
    methods: {}
})

function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i = 0; i < vars.length; i++) {
        var pair = vars[i].split("=");
        if (pair[0] == variable) {
            return pair[1];
        }
    }
    return (false);
}