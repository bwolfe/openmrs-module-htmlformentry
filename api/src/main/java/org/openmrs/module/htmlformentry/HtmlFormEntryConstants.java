package org.openmrs.module.htmlformentry;

/** Constants used by the HTML Form Entry module */

public class HtmlFormEntryConstants {

	/** Constant used by {@see HtmlFormEntryUtil#documentToString(Document)} */
    public final static String CONSTANT_XML = "xml";
    
    /** Constant used by {@see HtmlFormEntryUtil#documentToString(Document)} */
    public final static String CONSTANT_YES = "yes";
    
    /** Constant used by {@see HtmlFormEntryUtil#documentToString(Document)} */
    public final static String ERROR_TRANSFORMER_1 = "TransformerFactory.newTransformer error:";
   
    /** Constant used by {@see HtmlFormEntryUtil#documentToString(Document)} */
    public final static String ERROR_TRANSFORMER_2 = "Transformer.transform error:";
    
    public final static String[] ENCOUNTER_TAGS = {"encounterDate", "encounterLocation", "encounterProvider"};
    
    public final static String[] PATIENT_TAGS = {"patient"};

    public final static String GP_DATE_FORMAT = "htmlformentry.dateFormat";
    
    public final static String GP_SHOW_DATE_FORMAT = "htmlformentry.showDateFormat";
}
