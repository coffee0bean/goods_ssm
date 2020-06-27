var deta = null;
$(document).ready(function () {
    $.ajax({
        url:"../detail/selectDetail.action",
        dataType:"json",
        type:"get",
        success:function(data){
            vm.details = data;
        }
    })
})
var vm = new Vue({
    el:"#app",
    data:{
        details:deta
    },
    methods:{
        buy: function(id){
            window.open("buy.html?id="+id);
        }
    }
})

