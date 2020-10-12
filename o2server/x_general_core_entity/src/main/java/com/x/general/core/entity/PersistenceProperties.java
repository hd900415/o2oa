package com.x.general.core.entity;

import com.x.base.core.entity.AbstractPersistenceProperties;

public final class PersistenceProperties extends AbstractPersistenceProperties {

	public static class Area {

		public static class District {
			public static final String table = "ARA_DISTRICT";
		}

	}

	public static class General {

		public static class File {
			public static final String table = "GENERAL_FILE";
		}

	}
}
