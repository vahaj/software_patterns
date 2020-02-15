package main.java.com.translation;

import main.java.com.translation.TranslationConstants;

public class TranslationFactory {

	public ITranslation getTranslation(final String languageType) {
		ITranslation translation = null;
		if(TranslationConstants.ENGLISH.equalsIgnoreCase(languageType)) {
			translation = new EnglishTranslation();
		}
		if(TranslationConstants.FRENCH.equalsIgnoreCase(languageType)) {
			translation = new FrenchTranslation();
		}
		return translation;
	}
}