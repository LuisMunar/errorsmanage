package com.errorsmanage.errorsmanage.models;

import java.util.Date;

public class Error {
  private String message;
  private String error;
  private Date date;

  public Error(String message, String error, Date date) {
    this.message = message;
    this.error = error;
    this.date = date;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
