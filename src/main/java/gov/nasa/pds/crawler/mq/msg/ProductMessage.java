package gov.nasa.pds.crawler.mq.msg;

import java.util.List;
import java.util.Set;

/**
 * A message to harvest a batch of product files
 * @author karpenko
 */
public class ProductMessage
{
    /**
     * Harvest job ID. Autogenerated UUID.
     */
    public String jobId;
    
    /**
     * PDS node name, such as "PDS_ENG".
     */
    public String nodeName;

    /**
     * List of non-standard date fields, such as "cassini:VIMS_Specific_Attributes/cassini:start_time_doy"
     * to convert to ISO date format.
     * NOTE: Harvest automatically converts fields containing text "date" in the field name.
     */
    public Set<String> dateFields;
    
    /**
     * List of rules to generate file references.
     */
    public List<String> fileRefRules;

    /**
     * Overwrite existing products in the Registry (Elasticsearch) if set to true.
     */
    public boolean overwrite = false;

    /**
     * List of PDS labels to process
     */
    public List<String> files;
    
    /**
     * List of PDS label LIDVIDs
     */
    public List<String> lidvids;
    
    
    /**
     * Constructor
     */
    public ProductMessage()
    {
    }
}
