package section_2.lesson_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


/**
 * @author ctschubel
 *
 */
public class PersistanceService {


	public void persistArrayList( final List<String> list, final File filename) {

		try(PrintWriter pw = new PrintWriter(new FileWriter(filename))){

			for(Object o: list) {
				pw.println(o);
			}

		} catch (IOException e) {
			throw new RuntimeException("Something went wrong!", e);
		}


	}

}
