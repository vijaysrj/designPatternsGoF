package behavioural.mediator.pattern;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaMediator {

	List<SocialMedia> socialMediaList = new ArrayList<SocialMedia>();

	public void register(SocialMedia media) {

		this.socialMediaList.add(media);
	}

	public void notifyMediator(SocialMedia media, String text) {

		for (SocialMedia socialMedia : this.socialMediaList) {

			if (!socialMedia.getClass().equals(media.getClass())) {

				socialMedia.postFromOtherMedia(media.getClass().getSimpleName(), text);
			}
		}

	}

}
