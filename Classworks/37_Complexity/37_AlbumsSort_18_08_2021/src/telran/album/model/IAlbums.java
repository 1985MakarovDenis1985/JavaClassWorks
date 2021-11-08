package telran.album.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Predicate;

public interface IAlbums {
	boolean addPhoto(Photo photo);

	boolean removePhoto(int photoId, int albomId);

	boolean updatePhoto(int photoId, int albomId, String url);

	Photo getPhotoFromAlbum(int photoId, int albomId);

	default Photo[] getAllPhotoFromAlbum(int albomId) {
		return getPhotosByPredicate(p -> p.getAlbomId() == albomId);
	}

	default Photo[] getPhotoBeetwenDate(LocalDate dateFrom, LocalDate dateTo) {
		if (dateFrom.isAfter(dateTo)) {
			throw new IllegalArgumentException("Wrong order of arguments");
		}
		return getPhotosByPredicate(p -> p.getDate().isAfter(dateFrom.atTime(LocalTime.MIN))
				&& p.getDate().isBefore(dateTo.atTime(LocalTime.MAX)));
	}

	int size();

	Photo[] getPhotosByPredicate(Predicate<Photo> predicate);

}
