/*
 * homepage
 */
$(function(){
    //Math.uuid()
    //layer.msg('automatically');

    //debugger;
    //var commonObj = commonObj();
    //commonObj.getUrlParamObj("www.baidu.com?id=1");

    $("h2").click(function () {
        loadArea();
    })
    function loadArea(){
        $.ajax('../area/all',{
            type:'get',
            data:{
                'name':'ben'
            },
            dataType:'json',
            success:function (data) {
                //debugger;
                $("h2").after(JSON.stringify(data));
            }
        })
    };



})


