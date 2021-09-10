package MoodAnalyser;

import MoodAnalyser.MoodAnalysisException.ExceptionType;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
		this.message = "sad";
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
		if (this.message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
		}
		catch(NullPointerException e) {
			return "HAPPY";
		}

	}
}
