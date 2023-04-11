package com.dreamguys.truelysell.datamodel.Phase3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import com.dreamguys.truelysell.datamodel.BaseResponse;

public class DAOSearchServices extends BaseResponse {

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
        @SerializedName("service_list")
        @Expose
        private List<Service> serviceList = null;

        public Pages getPages() {
            return pages;
        }

        public void setPages(Pages pages) {
            this.pages = pages;
        }

        public List<Service> getServiceList() {
            return serviceList;
        }

        public void setServiceList(List<Service> serviceList) {
            this.serviceList = serviceList;
        }

        public class Pages {

            @SerializedName("next_page")
            @Expose
            private String nextPage;
            @SerializedName("current_page")
            @Expose
            private String currentPage;
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

            public String getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(String currentPage) {
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
            @SerializedName("service_location")
            @Expose
            private String serviceLocation;
            @SerializedName("service_latitude")
            @Expose
            private String serviceLatitude;
            @SerializedName("service_longitude")
            @Expose
            private String serviceLongitude;
            @SerializedName("service_image")
            @Expose
            private String serviceImage;
            @SerializedName("category_name")
            @Expose
            private String categoryName;
            @SerializedName("subcategory_name")
            @Expose
            private String subcategoryName;
            @SerializedName("rating")
            @Expose
            private String rating;
            @SerializedName("rating_count")
            @Expose
            private String ratingCount;
            @SerializedName("profile_img")
            @Expose
            private String profileImg;
            @SerializedName("currency")
            @Expose
            private String currency;
            @SerializedName("service_favorite")
            @Expose
            private Integer serviceFavorite;

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

            public String getServiceLocation() {
                return serviceLocation;
            }

            public void setServiceLocation(String serviceLocation) {
                this.serviceLocation = serviceLocation;
            }

            public String getServiceLatitude() {
                return serviceLatitude;
            }

            public void setServiceLatitude(String serviceLatitude) {
                this.serviceLatitude = serviceLatitude;
            }

            public String getServiceLongitude() {
                return serviceLongitude;
            }

            public void setServiceLongitude(String serviceLongitude) {
                this.serviceLongitude = serviceLongitude;
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

            public String getSubcategoryName() {
                return subcategoryName;
            }

            public void setSubcategoryName(String subcategoryName) {
                this.subcategoryName = subcategoryName;
            }

            public String getRating() {
                return rating;
            }

            public void setRating(String rating) {
                this.rating = rating;
            }

            public String getRatingCount() {
                return ratingCount;
            }

            public void setRatingCount(String ratingCount) {
                this.ratingCount = ratingCount;
            }

            public String getProfileImg() {
                return profileImg;
            }

            public void setProfileImg(String profileImg) {
                this.profileImg = profileImg;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public Integer getServiceFavorite() {
                return serviceFavorite;
            }

            public void setServiceFavorite(Integer serviceFavorite) {
                this.serviceFavorite = serviceFavorite;
            }

        }

    }


}
