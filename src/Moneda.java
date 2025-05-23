public record Moneda(String result,
                     String documentation,
                     String terms_of_use,
                     Integer time_last_update_unix,
                     String time_last_update_utc,
                     Integer time_next_update_unix,
                     String time_next_update_utc,
                     String base_code,
                     String target_code,
                     Float conversion_rate) {
}
