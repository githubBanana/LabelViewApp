package com.diy.labelview;

import java.io.Serializable;

public class Tag implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 2684657309332033242L;

	private int location;
	private int backgroundResId;
	private String id;
	private boolean isChecked;
	private int leftDrawableResId;
	private int rightDrawableResId;
	private String title;
	private boolean deleteMode = false;

	public Tag() {

	}

	public Tag(int location,String paramInt, String paramString) {
		this.location = location;
		this.id = paramInt;
		this.title = paramString;
	}

	public int getBackgroundResId() {
		return this.backgroundResId;
	}

	public boolean isDeleteMode() {
		return deleteMode;
	}

	public void setDeleteMode(boolean deleteMode) {
		this.deleteMode = deleteMode;
	}

	public int getLocation() {return  this.location;}

	public String getId() {
		return this.id;
	}

	public int getLeftDrawableResId() {
		return this.leftDrawableResId;
	}

	public int getRightDrawableResId() {
		return this.rightDrawableResId;
	}

	public String getTitle() {
		return this.title;
	}

	public boolean isChecked() {
		return this.isChecked;
	}

	public void setBackgroundResId(int paramInt) {
		this.backgroundResId = paramInt;
	}

	public void setChecked(boolean paramBoolean) {
		this.isChecked = paramBoolean;
	}

	public void setLocation(int location) {this.location = location;}

	public void setId(String paramInt) {
		this.id = paramInt;
	}

	public void setLeftDrawableResId(int paramInt) {
		this.leftDrawableResId = paramInt;
	}

	public void setRightDrawableResId(int paramInt) {
		this.rightDrawableResId = paramInt;
	}

	public void setTitle(String paramString) {
		this.title = paramString;
	}
}
