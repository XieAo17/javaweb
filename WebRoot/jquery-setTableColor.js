//用插件
$.fn.setTableColor=function(c1,c2){
	//首行颜色
	this.find('tr:first').css('background-color',c1);
	//其余行
	this.find('tr:gt(0):odd').css('background-color',c2);
}