package co.edu.uco.ucobet.domain;

import co.edu.uco.crosscutting.helpers.UUIDHelper;
import java.util.UUID;

class Domain 
{
	private UUID id;
	
	protected Domain(final UUID id) {
		setId (id);
	}

	protected UUID getId() {
		return id;
	}

	protected void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}
}