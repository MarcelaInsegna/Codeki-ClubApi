package CaCMarcelaInsegna.ClubApi.Repository;

import CaCMarcelaInsegna.ClubApi.Model.SociosClub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SociosClubRepository extends JpaRepository<SociosClub, Long> {
    }


