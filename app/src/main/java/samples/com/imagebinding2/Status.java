package samples.com.imagebinding2;

import android.support.annotation.NonNull;

@SuppressWarnings("Unused")
public class Status {


    private final String imageUrl;

    public Status(@NonNull String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}