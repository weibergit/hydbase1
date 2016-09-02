package hyd.base.pojo.vo;

import hyd.base.pojo.po.OrgRole;

import java.util.ArrayList;
import java.util.List;


public class RoleCustom extends OrgRole{
   
   private ArrayList<RoleCustom> children;
   private String text;
   
public ArrayList<RoleCustom> getChildren() {
	return children;
}

public void setChildren(ArrayList<RoleCustom> children) {
	this.children = children;
}


public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}



   
}