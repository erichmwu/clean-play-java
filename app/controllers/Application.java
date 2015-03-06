package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Gives a controller for this application.
 */
public class Application extends Controller {

  /**
   * Returns a play template of the index page.
   *
   * @return template for the index page.
   */
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

}
