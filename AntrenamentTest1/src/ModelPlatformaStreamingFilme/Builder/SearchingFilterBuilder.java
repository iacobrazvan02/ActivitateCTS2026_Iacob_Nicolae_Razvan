package ModelPlatformaStreamingFilme.Builder;

public class SearchingFilterBuilder implements Builder {
    private String titlu;
    private int an;
    private String gen;
    private String actori;
    private double rating;
    private boolean recomandat;

    @Override
    public SearchingFilter build() {
        return new SearchingFilter(titlu, an, gen, actori, rating, recomandat);
    }

    @Override
    public Builder setTitle(boolean title) {
        return null;
    }

    @Override
    public Builder setGenre(boolean genre) {
        return null;
    }

    @Override
    public Builder setReleaseYear(boolean releaseYear) {
        return null;
    }

    @Override
    public Builder setActor(boolean actor) {
        return null;
    }

    @Override
    public Builder setRating(boolean rating) {
        return null;
    }

    public SearchingFilterBuilder setTitlu(String titlu) {
        this.titlu = titlu;
        return this;
    }

    public SearchingFilterBuilder setAn(int an) {
        this.an = an;
        return this;
    }

    public SearchingFilterBuilder setGen(String gen) {
        this.gen = gen;
        return this;
    }

    public SearchingFilterBuilder setActori(String actori) {
        this.actori = actori;
        return this;
    }

    public SearchingFilterBuilder setRating(double rating) {
        this.rating = rating;
        return this;
    }

    public SearchingFilterBuilder setRecomandat(boolean recomandat) {
        this.recomandat = recomandat;
        return this;
    }
}