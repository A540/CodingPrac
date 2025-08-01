git filter-branch -f --env-filter '
WRONG_NAME="[CLOUD4] 박진영"
NEW_NAME="A540"
NEW_EMAIL="wlsdud2528@gmail.com"
if [ "$GIT_AUTHOR_NAME" = "$WRONG_NAME" ]
then
    export GIT_AUTHOR_NAME="$NEW_NAME"
    export GIT_AUTHOR_EMAIL="$NEW_EMAIL"
fi
if [ "$GIT_COMMITTER_NAME" = "$WRONG_NAME" ]
then
    export GIT_COMMITTER_NAME="$NEW_NAME"
    export GIT_COMMITTER_EMAIL="$NEW_EMAIL"
fi
' --tag-name-filter cat -- --branches --tags