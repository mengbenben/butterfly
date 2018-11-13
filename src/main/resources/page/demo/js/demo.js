/*
 * demo
 */
$(function(){
    //Math.uuid()
    layer.msg('automatically');

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


