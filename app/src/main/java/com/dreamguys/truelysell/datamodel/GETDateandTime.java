package com.dreamguys.truelysell.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GETDateandTime {

    @SerializedName("response")
    @Expose
    private Response response;
    @SerializedName("data")
    @Expose
    private Data data;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }



    public class Data {

        @SerializedName("date_format")
        @Expose
        private String dateFormat;
        @SerializedName("timezone")
        @Expose
        private String timezone;
        @SerializedName("time_format")
        @Expose
        private String timeFormat;

        public String getDateFormat() {
            return dateFormat;
        }

        public void setDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public String getTimeFormat() {
            return timeFormat;
        }

        public void setTimeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
        }

    }



    public class Response {

        @SerializedName("response_code")
        @Expose
        private Integer responseCode;
        @SerializedName("response_message")
        @Expose
        private String responseMessage;

        public Integer getResponseCode() {
            return responseCode;
        }

        public void setResponseCode(Integer responseCode) {
            this.responseCode = responseCode;
        }

        public String getResponseMessage() {
            return responseMessage;
        }

        public void setResponseMessage(String responseMessage) {
            this.responseMessage = responseMessage;
        }

    }



}