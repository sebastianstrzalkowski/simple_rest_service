package pl.sebastianstrzalkowski.simple_rest_service.dao;

import org.springframework.stereotype.Repository;
import pl.sebastianstrzalkowski.simple_rest_service.model.Film;

import java.util.*;

@Repository
public class FilmDAO {
    private static final Map<String, Film> filmMap = new HashMap<String, Film>();

    static {
        initFilms();
    }

    private static void initFilms() {
        Film film1  = new Film("1","Zielona mila", "Dramat","Frank Darabont","1999");
        Film film2  = new Film("2","Forrest Gump", "Komedia","Robert Zemeckis","1994");
        Film film3  = new Film("3","Matrix", "Sci-Fi","Lily Wachowski","1999");


        filmMap.put(film1.getId(), film1);
        filmMap.put(film2.getId(), film2);
        filmMap.put(film3.getId(), film3);
    }

    public Film getFilm(String id) {
        return filmMap.get(id);
    }

    public Film addFilm(Film film) {
        filmMap.put(film.getId(), film);
        return film;
    }


    public List<Film> getAllFilms() {
        Collection<Film> c = filmMap.values();
        List<Film> list = new ArrayList<>();
        for(Film x : c){
            Film film = new Film(x.getId(),x.getFilmName());
            list.add(film);
        }
        return list;
    }


}
