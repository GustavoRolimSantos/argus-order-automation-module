package data.extraction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import autoimport.AutoImport;
import data.Client;
import data.Payment;
import data.Product;

public class Extractor {
	
	private AutoImport autoImport;
	
	public Extractor(AutoImport autoImport) {
		this.autoImport = autoImport;
	}

	public void execute(File file) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF-8"));

			/* Client */

			reader.readLine(); // Header (ignore)
			String[] clientInfo = reader.readLine().replace("\"", "").split(";"); // info cliente
			autoImport.setClient(new Client(clientInfo[0], clientInfo[1], clientInfo[2], clientInfo[3], clientInfo[4], clientInfo[5], clientInfo[6], clientInfo[7], clientInfo[8], clientInfo[9], clientInfo[10], clientInfo[11], clientInfo[12], clientInfo[13], clientInfo[14], clientInfo[15], clientInfo[16], clientInfo[17], clientInfo[18], clientInfo[19], clientInfo[20], clientInfo[21], clientInfo[22], clientInfo[23], clientInfo[24], clientInfo[25], clientInfo[26], clientInfo[27], clientInfo[28], clientInfo[29], clientInfo[30]));

			/* Products */

			reader.readLine();  // Header (ignore)
			
			String line = reader.readLine();

			while (line != null) {

				line = line.replace("\"", "");

				String[] content = line.split(";");

				if (line.contains("tipo_do_registro"))
					autoImport.setPayment(new Payment(content[1]));

				if (line.contains("prazo") && !line.contains("prazo_em_dias"))
					autoImport.getPayment().setPrazo_em_dias(autoImport.getPayment().getPrazo_em_dias() != null ? autoImport.getPayment().getPrazo_em_dias() + "/" + content[1] : content[1]);

				if (content.length == 14)
					autoImport.getProducts().add(new Product(content[0], content[1], content[2], content[3], content[4], content[5], content[6], content[7], content[8], content[9], content[10], content[11], content[12], content[13]));

				line = reader.readLine();
			}

			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
