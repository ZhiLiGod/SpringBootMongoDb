package com.mongodb.SpringbootMongodb.Model;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
public class Account implements Serializable {
	private static final long serialVersionUID = 6141258223022498435L;

	@Id
	private ObjectId _id;

	private String reference;

	private String displayName;

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return "Account [_id=" + _id + ", reference=" + reference + ", displayName=" + displayName + "]";
	}
	
	
}
