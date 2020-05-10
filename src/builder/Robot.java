package builder;

public class Robot {

	private String head;
	private String legs;
	private String arms;
	private String torso;
	
	private Robot(Builder builder) {
		this.head = builder.head;
		this.legs = builder.legs;
		this.arms = builder.arms;
		this.torso = builder.torso;
	}

	public String getHead() {
		return head;
	}

	public String getLegs() {
		return legs;
	}

	public String getArms() {
		return arms;
	}

	public String getTorso() {
		return torso;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		
		private String head;
		private String legs;
		private String arms;
		private String torso;
		
		public Builder buildHead(String head) {
			this.head = head;
			return this;
		}
		public Builder buildLegs(String legs) {
			this.legs = legs;
			return this;
		}
		public Builder buildArms(String arms) {
			this.arms = arms;
			return this;
		}
		public Builder buildTorso(String torso) {
			this.torso = torso;
			return this;
		}
		
		public Robot build() {
			return new Robot(this);
		}
		
	}
}
