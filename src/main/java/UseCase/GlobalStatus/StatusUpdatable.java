package UseCase.GlobalStatus;

/**
 * An interface for UI to implement
 **/
public interface StatusUpdatable {
    /**
     * A viewer displaying all information of current status
     * @param statusResponseModel A response model containing all information of current status
     **/
    void viewStatus(StatusResponseModel statusResponseModel);
}
