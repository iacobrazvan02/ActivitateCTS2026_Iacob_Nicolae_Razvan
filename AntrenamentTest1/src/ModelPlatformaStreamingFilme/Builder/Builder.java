package ModelPlatformaStreamingFilme.Builder;

public interface Builder {
    SearchingFilter build();
    Builder setTitle(boolean title);
    Builder setGenre(boolean genre);
    Builder setReleaseYear(boolean releaseYear);
    Builder setActor(boolean actor);
    Builder setRating(boolean rating);
}