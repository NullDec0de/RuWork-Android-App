package com.dreamguys.truelysell.datamodel.Phase3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import com.dreamguys.truelysell.datamodel.BaseResponse;

public class DAOBookingList extends BaseResponse {

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

        @SerializedName("pages")
        @Expose
        private Pages pages;
        @SerializedName("booking_list")
        @Expose
        private List<Booking> bookingList = null;

        public Pages getPages() {
            return pages;
        }

        public void setPages(Pages pages) {
            this.pages = pages;
        }

        public List<Booking> getBookingList() {
            return bookingList;
        }

        public void setBookingList(List<Booking> bookingList) {
            this.bookingList = bookingList;
        }


        public class Booking {

            @SerializedName("id")
            @Expose
            private String id;
            @SerializedName("user_id")
            @Expose
            private String userId;
            @SerializedName("token")
            @Expose
            private String token;
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("profile_img")
            @Expose
            private String profileImg;
            @SerializedName("provider_id")
            @Expose
            private String providerId;
            @SerializedName("location")
            @Expose
            private String location;
            @SerializedName("service_date")
            @Expose
            private String serviceDate;
            @SerializedName("from_time")
            @Expose
            private String fromTime;
            @SerializedName("to_time")
            @Expose
            private String toTime;
            @SerializedName("service_title")
            @Expose
            private String serviceTitle;
            @SerializedName("service_amount")
            @Expose
            private String serviceAmount;
            @SerializedName("category_name")
            @Expose
            private String categoryName;
            @SerializedName("subcategory_name")
            @Expose
            private String subcategoryName;
            @SerializedName("service_image")
            @Expose
            private String serviceImage;
            @SerializedName("rating_count")
            @Expose
            private String ratingCount;
            @SerializedName("rating")
            @Expose
            private String rating;
            @SerializedName("mobileno")
            @Expose
            private String mobileno;
            @SerializedName("country_code")
            @Expose
            private String countryCode;
            @SerializedName("notes")
            @Expose
            private String notes;
            @SerializedName("latitude")
            @Expose
            private String latitude;
            @SerializedName("longitude")
            @Expose
            private String longitude;
            @SerializedName("currency")
            @Expose
            private String currency;
            @SerializedName("status")
            @Expose
            private String status;
            @SerializedName("provider_profile")
            @Expose
            private String providerProfile;
            @SerializedName("cod")
            @Expose
            private String cod;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getProfileImg() {
                return profileImg;
            }

            public void setProfileImg(String profileImg) {
                this.profileImg = profileImg;
            }

            public String getProviderId() {
                return providerId;
            }

            public void setProviderId(String providerId) {
                this.providerId = providerId;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getServiceDate() {
                return serviceDate;
            }

            public void setServiceDate(String serviceDate) {
                this.serviceDate = serviceDate;
            }

            public String getFromTime() {
                return fromTime;
            }

            public void setFromTime(String fromTime) {
                this.fromTime = fromTime;
            }

            public String getToTime() {
                return toTime;
            }

            public void setToTime(String toTime) {
                this.toTime = toTime;
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

            public String getCategoryName() {
                return categoryName;
            }

            public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
            }

            public String getSubcategoryName() {
                return subcategoryName;
            }

            public void setSubcategoryName(String subcategoryName) {
                this.subcategoryName = subcategoryName;
            }

            public String getServiceImage() {
                return serviceImage;
            }

            public void setServiceImage(String serviceImage) {
                this.serviceImage = serviceImage;
            }

            public String getRatingCount() {
                return ratingCount;
            }

            public void setRatingCount(String ratingCount) {
                this.ratingCount = ratingCount;
            }

            public String getRating() {
                return rating;
            }

            public void setRating(String rating) {
                this.rating = rating;
            }

            public String getMobileno() {
                return mobileno;
            }

            public void setMobileno(String mobileno) {
                this.mobileno = mobileno;
            }

            public String getCountryCode() {
                return countryCode;
            }

            public void setCountryCode(String countryCode) {
                this.countryCode = countryCode;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getProviderProfile() {
                return providerProfile;
            }

            public void setProviderProfile(String providerProfile) {
                this.providerProfile = providerProfile;
            }

            public String getCod() {
                return cod;
            }

            public void setCod(String cod) {
                this.cod = cod;
            }

        }


        public class Pages {

            @SerializedName("next_page")
            @Expose
            private String nextPage;
            @SerializedName("current_page")
            @Expose
            private Object currentPage;
            @SerializedName("total_pages")
            @Expose
            private String totalPages;
            @SerializedName("total_records")
            @Expose
            private String totalRecords;

            public String getNextPage() {
                return nextPage;
            }

            public void setNextPage(String nextPage) {
                this.nextPage = nextPage;
            }

            public Object getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(Object currentPage) {
                this.currentPage = currentPage;
            }

            public String getTotalPages() {
                return totalPages;
            }

            public void setTotalPages(String totalPages) {
                this.totalPages = totalPages;
            }

            public String getTotalRecords() {
                return totalRecords;
            }

            public void setTotalRecords(String totalRecords) {
                this.totalRecords = totalRecords;
            }

        }


    }

}