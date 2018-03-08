package com.bitcamp.web.enums;

public enum Direction {
	resources,js,img,css,
	JS{
		public String toString() {
			return "/"+resources+"/"+js;
		}
	},
	IMG{
		public String toString() {
			return "/"+resources+"/"+img;
		}
	},
	CSS{
		public String toString() {
			return "/"+resources+"/"+css;
		}
	}
}
