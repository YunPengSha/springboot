package com.note.handler;

import com.note.exception.ServiceException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by gui.a on 2017/6/11.
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandlerAdvice {

  protected static final Logger LOGGER = Logger.getLogger(ExceptionHandlerAdvice.class);

  @ExceptionHandler(value = ServiceException.class)
  public Object handle(ServiceException errResp, Model model, HttpServletRequest request,
      HttpServletResponse response) {
    return errResp.getMessage();
  }

  @ResponseBody
  @ResponseStatus(HttpStatus.OK)
  @ExceptionHandler(value = Exception.class)
  public Object handle(Exception errResp, Model model,
      HttpServletRequest request,
      HttpServletResponse response) {
    return errResp.getMessage();
  }

  @ResponseBody
  @ResponseStatus(HttpStatus.OK)
  @ExceptionHandler(value = Throwable.class)
  public Object handle(Throwable errResp, Model model, HttpServletRequest request,
      HttpServletResponse response) {
    return errResp.getMessage();
  }
}
