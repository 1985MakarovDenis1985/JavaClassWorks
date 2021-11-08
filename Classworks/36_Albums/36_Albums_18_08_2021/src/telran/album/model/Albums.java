package telran.album.model;

import java.time.LocalDate;

public class Albums implements IAlbums {
	private Photo[] photos;
	private int size;

	public Albums(int capacity) {
		photos = new Photo[capacity];
	}

	@Override
	public boolean addPhoto(Photo photo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePhoto(int photoId, int albomId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePhoto(int photoId, int albomId, String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Photo getPhotoFromAlbum(int photoId, int albomId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Photo[] getAllPhotoFromAlbum(int albomId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Photo[] getPhotoBeetwenDate(LocalDate dateFrom, LocalDate dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
