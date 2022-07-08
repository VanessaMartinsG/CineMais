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
    // Cria o parse de tratamento
    JSONParser parser = new JSONParser();
    private List<Cinema> cinemas;
<<<<<<< Updated upstream
    String emailV;
    String senhaV;
 
=======
>>>>>>> Stashed changes

    public DataBase() {
        this.cinemas = new ArrayList<Cinema>();
    }

    public void initDb() {
        try {
<<<<<<< Updated upstream
			//Salva no objeto JSONObject o que o parse tratou do arquivo
			jsonObject = (JSONObject) parser.parse(new FileReader(
					"C:/Users/Jadson/Documents/CineMais-main/CineMais/src/data/db.json"));

                    emailV = (String) jsonObject.get("email");
                    senhaV = (String) jsonObject.get("senha");
            JSONArray shoppings = (JSONArray) jsonObject.get("shopping");
=======
            // Salva no objeto JSONObject o que o parse tratou do arquivo
            jsonObject = (JSONObject) parser.parse(new FileReader(
                    "C:/Users/compu/Documents/6 semestre/PAS/TRAB FINAL/CineMais/CineMais/src/data/db.json"));

            JSONArray shoppings = (JSONArray) jsonObject.get("shoppings");
>>>>>>> Stashed changes
            JSONArray id = (JSONArray) jsonObject.get("id");
            for (int i = 0; i < shoppings.size(); i++) {
                this.cinemas.add(new Cinema("CineMais", shoppings.get(i).toString()));
            }
<<<<<<< Updated upstream

           

            
		}
		//Trata as exceptions que podem ser lançadas no decorrer do processo
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
         }catch (org.json.simple.parser.ParseException e) {
=======
        }
        // Trata as exceptions que podem ser lançadas no decorrer do processo
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
>>>>>>> Stashed changes
            e.printStackTrace();
        }
    }

    public List<Cinema> getCinemas() {
        return this.cinemas;
    }
<<<<<<< Updated upstream

    public String getEmail(){
        return this.emailV;
    }

    public String getSenha(){
        return this.senhaV;
    }
    
    
}
=======
>>>>>>> Stashed changes

}
