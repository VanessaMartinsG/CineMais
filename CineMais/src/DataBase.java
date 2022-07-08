import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class DataBase {
    JSONObject jsonObject;
	//Cria o parse de tratamento
	JSONParser parser = new JSONParser();
    private List<Cinema> cinemas;
 

    public DataBase(){
        this.cinemas = new ArrayList<Cinema>();
    }

    public void initDb(){
        try {
			//Salva no objeto JSONObject o que o parse tratou do arquivo
			jsonObject = (JSONObject) parser.parse(new FileReader(
					"C:/Users/aronc_x1x6ng/OneDrive/Documentos/CineMais/CineMais/src/data/db.json"));

            JSONArray shoppings = (JSONArray) jsonObject.get("shopping");
            JSONArray id = (JSONArray) jsonObject.get("id");
            for (int i = 0; i < shoppings.size(); i++) {
                this.cinemas.add(new Cinema("CineMais", shoppings.get(i).toString()));
            }
		}
		//Trata as exceptions que podem ser lançadas no decorrer do processo
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
         }catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }

    public List<Cinema> getCinemas(){
        return this.cinemas;
    }
    
    
}

