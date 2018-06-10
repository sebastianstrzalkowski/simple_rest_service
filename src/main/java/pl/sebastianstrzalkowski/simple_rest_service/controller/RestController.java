package pl.sebastianstrzalkowski.simple_rest_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.sebastianstrzalkowski.simple_rest_service.dao.FilmDAO;

import pl.sebastianstrzalkowski.simple_rest_service.model.Film;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private FilmDAO filmDAO;

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to simple rest service";
    }


    @RequestMapping(value = "/films", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Film> getFilms() {
        List<Film> list = filmDAO.getAllFilms();
        return list;
    }

    @RequestMapping(value = "/films.json", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Film> getFilmsJSON() {
        List<Film> list = filmDAO.getAllFilms();
        return list;
    }

    @RequestMapping(value = "/films.xml", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Film> getFilmsXML() {
        List<Film> list = filmDAO.getAllFilms();
        return list;
    }

    @RequestMapping(value = "/film/{id}", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Film getFilm(@PathVariable("id") String id) {
        return filmDAO.getFilm(id);
    }

    @RequestMapping(value = "/film/{id}.json", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Film getFilmJSON(@PathVariable("id") String id) {
        return filmDAO.getFilm(id);
    }

    @RequestMapping(value = "/film/{id}.xml", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Film getFilmXML(@PathVariable("id") String id) {
        return filmDAO.getFilm(id);
    }


    @RequestMapping(value = "/film", //
            method = RequestMethod.POST, //
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, //
                    MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Film addFilm(@RequestBody Film film) {

        System.out.println("(Service Side) Creating employee: " + film.getId());

        return filmDAO.addFilm(film);
    }


}
