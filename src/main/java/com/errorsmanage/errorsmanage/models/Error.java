package com.errorsmanage.errorsmanage.models;

import java.util.Date;

public class Error {
  private String message;
  private String error;
  private Date timestamp;

  public Error(String message, String error, Date timestamp) {
    this.message = message;
    this.error = error;
    this.timestamp = timestamp;
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
    return timestamp;
  }

  public void setDate(Date timestamp) {
    this.timestamp = timestamp;
  }
}
