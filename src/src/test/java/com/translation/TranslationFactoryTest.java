package src.test.java.com.translation;

import main.java.com.translation.TranslationConstants;

import main.java.com.translation.EnglishTranslation;
import main.java.com.translation.FrenchTranslation;
import main.java.com.translation.TranslationFactory;

public class TranslationFactoryTest {

	/** 
	 * @param args Main method arguments
	 */
	public static void main(final String[] args) {
		final TranslationFactory translationFactory = new TranslationFactory();
		final EnglishTranslation english = (EnglishTranslation) translationFactory //
				.getTranslation(TranslationConstants.ENGLISH);
		english.translate();
		final FrenchTranslation french = (FrenchTranslation) translationFactory //
				.getTranslation(TranslationConstants.FRENCH);
		french.translate();
	}
}
