package net.sf.uadetector.json.internal.data.field;

public enum SerializableRobotField {

	FAMILY_NAME("family-name"),

	HASH("hash"),

	ICON("icon"),

	INFO_URL("info-url"),

	NAME("name"),

	PRODUCER("producer"),

	PRODUCER_URL("producer-url"),

	TYPE("type"),

	USER_AGENT_STRING("user-agent-string");

	private final String name;

	private SerializableRobotField(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
