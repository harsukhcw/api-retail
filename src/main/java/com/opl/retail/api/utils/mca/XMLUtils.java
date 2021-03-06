/**
 * 
 */
package  com.opl.retail.api.utils.mca;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * @author sanket
 *
 */
public class XMLUtils {
	private XMLUtils()
	{
// Do nothing because of X and Y.
	}
	
	public static String toXML(Object object,Class<?> clazz) throws JAXBException{
		StringWriter writer  = new StringWriter();
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(object, writer);
		return writer.toString();	
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T toObject(String xmlString, Class<?> clazz) throws JAXBException{

		StringReader reader  = new StringReader(xmlString);
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
		Unmarshaller marshaller = jaxbContext.createUnmarshaller();
		return (T)marshaller.unmarshal(reader);
	}
	

	@SuppressWarnings("unchecked")
	public static <T> T toObject(String xmlString, Class<?> clazz, Class objectFactory) throws JAXBException{
		try{
			StringReader reader  = new StringReader(xmlString.replaceAll("&", "and"));
			JAXBContext jaxbContext = JAXBContext.newInstance(clazz,objectFactory);
			Unmarshaller marshaller = jaxbContext.createUnmarshaller();
			return (T)marshaller.unmarshal(reader);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@SuppressWarnings("unchecked")
	public static String toJSONString(String xmlString, Class<?> clazz, Class objectFactory) throws JAXBException{

		StringReader reader  = new StringReader(xmlString);
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz,objectFactory);
		Unmarshaller marshaller = jaxbContext.createUnmarshaller();
		marshaller.setProperty("eclipselink.media-type", "application/json");
		return (String)marshaller.unmarshal(reader);
	}

}
