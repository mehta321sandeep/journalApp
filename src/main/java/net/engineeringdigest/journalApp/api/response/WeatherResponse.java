package net.engineeringdigest.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

    @Data
    public class WeatherResponse{
        private Coord coord;

        private List<Weather> weather;

        private String base;

        private Main main;

        private Integer visibility;

        private Wind wind;

        private Clouds clouds;

        private Integer dt;

        private Sys sys;

        private Integer timezone;

        private Integer id;

        private String name;

        private Integer cod;

        @Data
        static class Coord {
            private Double lon;

            private Double lat;
        }

        @Data
        static class Weather {
            private Integer id;

            private String main;

            private String description;

            private String icon;
        }

        @Data
        static class Main {
            private Double temp;

            @JsonProperty("feels_like")
            private Double feelsLike;

            @JsonProperty("temp_min")
            private Double tempMin;

            @JsonProperty("temp_max")
            private Double tempMax;

            private Integer pressure;

            private Integer humidity;

            @JsonProperty("sea_level")
            private Integer seaLevel;

            @JsonProperty("grnd_level")
            private Integer grndLevel;
        }

        @Data
        static class Wind {
            private Double speed;

            private Integer deg;
        }

        @Data
        static class Clouds {
            private Integer all;
        }

        @Data
        static class Sys {
            private Integer type;

            private Integer id;

            private String country;

            private Integer sunrise;

            private Integer sunset;
        }
    }
