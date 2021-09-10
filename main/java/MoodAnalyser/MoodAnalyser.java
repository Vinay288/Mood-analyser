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

	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.length()==0)
				throw new MoodAnalysisException(ExceptionType.ENTERED_EMPTY,"Add proper message");
		if (this.message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException(ExceptionType.ENTERED_NULL,"add proper message");
		}

	}
}
