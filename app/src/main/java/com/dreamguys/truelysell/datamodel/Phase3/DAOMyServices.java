package com.dreamguys.truelysell.datamodel.Phase3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import com.dreamguys.truelysell.datamodel.BaseResponse;

public class DAOMyServices extends BaseResponse {

    @SerializedName("data")
    @Expose
    private Data data;


    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public class Data {

        @SerializedName("services")
        @Expose
        private List<Service> services = null;

        public List<Service> getServices() {
            return services;
        }

        public void setServices(List<Service> services) {
            this.services = services;
        }


        public class Service {

            @SerializedName("service_id")
            @Expose
            private String serviceId;
            @SerializedName("service_title")
            @Expose
            private String serviceTitle;
            @SerializedName("service_amount")
            @Expose
            private String serviceAmount;
            @SerializedName("service_image")
            @Expose
            private String serviceImage;
            @SerializedName("category_name")
            @Expose
            private String categoryName;
            @SerializedName("ratings")
            @Expose
            private String ratings;
            @SerializedName("rating_count")
            @Expose
            private String ratingCount;
            @SerializedName("user_image")
            @Expose
            private String userImage;
            @SerializedName("currency_code")
            @Expose
            private String currencyCode;
            @SerializedName("admin_verification")
            @Expose
            private String adminVerification;
            @SerializedName("is_active")
            @Expose
            private String isActive;
            @SerializedName("currency")
            @Expose
            private String currency;

            public String getServiceId() {
                return serviceId;
            }

            public void setServiceId(String serviceId) {
                this.serviceId = serviceId;
            }

            public String getServiceTitle() {
                return serviceTitle;
            }

            public void setServiceTitle(String serviceTitle) {
                this.serviceTitle = serviceTitle;
            }

            public String getServiceAmount() {
                return serviceAmount;
            }

            public void setServiceAmount(String serviceAmount) {
                this.serviceAmount = serviceAmount;
            }

            public String getServiceImage() {
                return serviceImage;
            }

            public void setServiceImage(String serviceImage) {
                this.serviceImage = serviceImage;
            }

            public String getCategoryName() {
                return categoryName;
            }

            public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
            }

            public String getRatings() {
                return ratings;
            }

            public void setRatings(String ratings) {
                this.ratings = ratings;
            }

            public String getRatingCount() {
                return ratingCount;
            }

            public void setRatingCount(String ratingCount) {
                this.ratingCount = ratingCount;
            }

            public String getUserImage() {
                return userImage;
            }

            public void setUserImage(String userImage) {
                this.userImage = userImage;
            }

            public String getCurrencyCode() {
                return currencyCode;
            }

            public void setCurrencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
            }

            public String getAdminVerification() {
                return adminVerification;
            }

            public void setAdminVerification(String adminVerification) {
                this.adminVerification = adminVerification;
            }

            public String getIsActive() {
                return isActive;
            }

            public void setIsActive(String isActive) {
                this.isActive = isActive;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

        }

    }


}
