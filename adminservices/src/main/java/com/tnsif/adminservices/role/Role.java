
package com.tnsif.adminservices.role;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Role {
	@JsonProperty("Super-Admin")
	Super_Admin,
	Manager,
	Staff
}
