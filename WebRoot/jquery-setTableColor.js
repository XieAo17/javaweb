//�ò��
$.fn.setTableColor=function(c1,c2){
	//������ɫ
	this.find('tr:first').css('background-color',c1);
	//������
	this.find('tr:gt(0):odd').css('background-color',c2);
}